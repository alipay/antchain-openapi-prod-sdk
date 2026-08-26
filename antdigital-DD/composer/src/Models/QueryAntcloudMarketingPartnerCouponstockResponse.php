<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingPartnerCouponstockResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'totalQuota' => 'total_quota',
        'releasedQuota' => 'released_quota',
        'availableQuota' => 'available_quota',
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
        if (null !== $this->totalQuota) {
            $res['total_quota'] = $this->totalQuota;
        }
        if (null !== $this->releasedQuota) {
            $res['released_quota'] = $this->releasedQuota;
        }
        if (null !== $this->availableQuota) {
            $res['available_quota'] = $this->availableQuota;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingPartnerCouponstockResponse
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
        if(isset($map['total_quota'])){
            $model->totalQuota = $map['total_quota'];
        }
        if(isset($map['released_quota'])){
            $model->releasedQuota = $map['released_quota'];
        }
        if(isset($map['available_quota'])){
            $model->availableQuota = $map['available_quota'];
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

    // 模版总量
    /**
     * @var int
     */
    public $totalQuota;

    // 已使用
    /**
     * @var int
     */
    public $releasedQuota;

    // 可用
    /**
     * @var int
     */
    public $availableQuota;

}
