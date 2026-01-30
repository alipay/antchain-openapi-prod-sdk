<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class SyncOfferCommonbuyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id offerCode_yyyyMMddHHm0(最后一位固定为0幂等用，请求10分钟内只能触发一次)
    /**
     * @var string
     */
    public $requestId;

    // 需要同步的商品code
    /**
     * @var string
     */
    public $offerCode;

    // 操作人工号
    /**
     * @var string
     */
    public $requestWorkNo;

    // 商品同步commonBuy的配置列表对应json
    /**
     * @var OfferSyncCommonBuyInfo
     */
    public $offerCommonBuySyncInfo;
    protected $_name = [
        'authToken'              => 'auth_token',
        'requestId'              => 'request_id',
        'offerCode'              => 'offer_code',
        'requestWorkNo'          => 'request_work_no',
        'offerCommonBuySyncInfo' => 'offer_common_buy_sync_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('offerCode', $this->offerCode, true);
        Model::validateRequired('requestWorkNo', $this->requestWorkNo, true);
        Model::validateRequired('offerCommonBuySyncInfo', $this->offerCommonBuySyncInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->offerCode) {
            $res['offer_code'] = $this->offerCode;
        }
        if (null !== $this->requestWorkNo) {
            $res['request_work_no'] = $this->requestWorkNo;
        }
        if (null !== $this->offerCommonBuySyncInfo) {
            $res['offer_common_buy_sync_info'] = null !== $this->offerCommonBuySyncInfo ? $this->offerCommonBuySyncInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncOfferCommonbuyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['offer_code'])) {
            $model->offerCode = $map['offer_code'];
        }
        if (isset($map['request_work_no'])) {
            $model->requestWorkNo = $map['request_work_no'];
        }
        if (isset($map['offer_common_buy_sync_info'])) {
            $model->offerCommonBuySyncInfo = OfferSyncCommonBuyInfo::fromMap($map['offer_common_buy_sync_info']);
        }

        return $model;
    }
}
