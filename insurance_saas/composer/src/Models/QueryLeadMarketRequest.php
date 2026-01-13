<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryLeadMarketRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 业务参数
    /**
     * @var string
     */
    public $bizContent;

    // 线索唯一编码
    /**
     * @var string
     */
    public $leadId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'bizContent'  => 'biz_content',
        'leadId'      => 'lead_id',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('leadId', $this->leadId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->leadId) {
            $res['lead_id'] = $this->leadId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeadMarketRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['lead_id'])) {
            $model->leadId = $map['lead_id'];
        }

        return $model;
    }
}
