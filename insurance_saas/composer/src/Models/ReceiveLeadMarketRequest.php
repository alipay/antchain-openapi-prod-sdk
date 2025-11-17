<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class ReceiveLeadMarketRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 线索唯一id
    /**
     * @var string
     */
    public $leadId;

    // 本次固定传LMKT_LEADS_TRANSFER
    /**
     * @var string
     */
    public $productCode;

    // 业务参数，json
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'   => 'auth_token',
        'leadId'      => 'lead_id',
        'productCode' => 'product_code',
        'bizContent'  => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('leadId', $this->leadId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->leadId) {
            $res['lead_id'] = $this->leadId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceiveLeadMarketRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['lead_id'])) {
            $model->leadId = $map['lead_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
