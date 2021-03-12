<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidZkpverifiableclaimVisibilityResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 索引字段，标示哪些字段是原始值，哪些字段是hash值
    /**
     * @var string
     */
    public $index;

    // 被隐藏了部分内容的VC内容
    /**
     * @var string
     */
    public $vcView;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'index'      => 'index',
        'vcView'     => 'vc_view',
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
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->vcView) {
            $res['vc_view'] = $this->vcView;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidZkpverifiableclaimVisibilityResponse
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
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['vc_view'])) {
            $model->vcView = $map['vc_view'];
        }

        return $model;
    }
}
