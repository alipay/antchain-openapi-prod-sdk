<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetDeploymentResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 操作执行者
    /**
     * @var string
     */
    public $executor;

    //
    // 发布单状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；CANCELING：取消中；CANCELED：已取消
    //
    /**
     * @var string
     */
    public $status;

    // 标题
    /**
     * @var string
     */
    public $title;

    // 此发布部署操作中所有被操作的应用详情，以操作链的形式体现
    /**
     * @var OpsApplicationChain[]
     */
    public $applicationChains;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'executor'          => 'executor',
        'status'            => 'status',
        'title'             => 'title',
        'applicationChains' => 'application_chains',
    ];

    public function validate()
    {
        Model::validateRequired('executor', $this->executor, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('applicationChains', $this->applicationChains, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->applicationChains) {
            $res['application_chains'] = [];
            if (null !== $this->applicationChains && \is_array($this->applicationChains)) {
                $n = 0;
                foreach ($this->applicationChains as $item) {
                    $res['application_chains'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDeploymentResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['executor'])) {
            $model->executor = $map['executor'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['application_chains'])) {
            if (!empty($map['application_chains'])) {
                $model->applicationChains = [];
                $n                        = 0;
                foreach ($map['application_chains'] as $item) {
                    $model->applicationChains[$n++] = null !== $item ? OpsApplicationChain::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
