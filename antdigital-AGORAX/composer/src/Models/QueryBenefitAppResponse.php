<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefitAppResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tierId' => 'tier_id',
        'tierName' => 'tier_name',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->tierId) {
            $res['tier_id'] = $this->tierId;
        }
        if (null !== $this->tierName) {
            $res['tier_name'] = $this->tierName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBenefitAppResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['tier_id'])){
            $model->tierId = $map['tier_id'];
        }
        if(isset($map['tier_name'])){
            $model->tierName = $map['tier_name'];
        }
        return $model;
    }
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

    // 平台配置的档位稳定 ID，例如TIER_17
    /**
     * @var string
     */
    public $tierId;

    // 档位名称，例如中级会员17元
    /**
     * @var string
     */
    public $tierName;

}
