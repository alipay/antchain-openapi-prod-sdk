<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class QueryLiveDanmakuResponse extends Model
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

    // LRXXXXXXXXXXXXXXXXX
    /**
     * @var string
     */
    public $instanceId;

    // 当前开播的直播项目id,格式参考:LPXXXXXXXXXXX
    /**
     * @var string
     */
    public $projectId;

    // 弹幕数据
    /**
     * @var DanmakuListBO[]
     */
    public $danmakuList;

    // 当前租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'instanceId'  => 'instance_id',
        'projectId'   => 'project_id',
        'danmakuList' => 'danmaku_list',
        'tenantId'    => 'tenant_id',
    ];

    public function validate()
    {
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->danmakuList) {
            $res['danmaku_list'] = [];
            if (null !== $this->danmakuList && \is_array($this->danmakuList)) {
                $n = 0;
                foreach ($this->danmakuList as $item) {
                    $res['danmaku_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLiveDanmakuResponse
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['danmaku_list'])) {
            if (!empty($map['danmaku_list'])) {
                $model->danmakuList = [];
                $n                  = 0;
                foreach ($map['danmaku_list'] as $item) {
                    $model->danmakuList[$n++] = null !== $item ? DanmakuListBO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
