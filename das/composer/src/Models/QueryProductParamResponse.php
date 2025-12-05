<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryProductParamResponse extends Model
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

    // 是否需要授权
    /**
     * @var bool
     */
    public $needAuth;

    // 产品参数信息列表
    /**
     * @var ProductParamInfo[]
     */
    public $paramInfoList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'needAuth'      => 'need_auth',
        'paramInfoList' => 'param_info_list',
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
        if (null !== $this->needAuth) {
            $res['need_auth'] = $this->needAuth;
        }
        if (null !== $this->paramInfoList) {
            $res['param_info_list'] = [];
            if (null !== $this->paramInfoList && \is_array($this->paramInfoList)) {
                $n = 0;
                foreach ($this->paramInfoList as $item) {
                    $res['param_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProductParamResponse
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
        if (isset($map['need_auth'])) {
            $model->needAuth = $map['need_auth'];
        }
        if (isset($map['param_info_list'])) {
            if (!empty($map['param_info_list'])) {
                $model->paramInfoList = [];
                $n                    = 0;
                foreach ($map['param_info_list'] as $item) {
                    $model->paramInfoList[$n++] = null !== $item ? ProductParamInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
