<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ImportIpAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 基础入参
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 支付宝的登陆用户名(必须实名制)
    /**
     * @var string
     */
    public $alipayLoginName;

    // 商户类型(本期仅支持: 1:企业, 6:个人商户)
    /**
     * @var int
     */
    public $merchantType;

    // 商户别名, 会展示在账单以及支付结果页中
    /**
     * @var string
     */
    public $merchantAliasName;

    // 商户法人名称, merchant_type = 1时必填
    /**
     * @var string
     */
    public $legalName;

    // 商户法人身份证号码, merchant_type = 1时必填
    /**
     * @var string
     */
    public $legalCertNo;

    // 结算目标账户(银行卡/支付宝)
    /**
     * @var string
     */
    public $settleTarget;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'alipayLoginName'   => 'alipay_login_name',
        'merchantType'      => 'merchant_type',
        'merchantAliasName' => 'merchant_alias_name',
        'legalName'         => 'legal_name',
        'legalCertNo'       => 'legal_cert_no',
        'settleTarget'      => 'settle_target',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('alipayLoginName', $this->alipayLoginName, true);
        Model::validateRequired('merchantType', $this->merchantType, true);
        Model::validateRequired('merchantAliasName', $this->merchantAliasName, true);
        Model::validateRequired('settleTarget', $this->settleTarget, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->alipayLoginName) {
            $res['alipay_login_name'] = $this->alipayLoginName;
        }
        if (null !== $this->merchantType) {
            $res['merchant_type'] = $this->merchantType;
        }
        if (null !== $this->merchantAliasName) {
            $res['merchant_alias_name'] = $this->merchantAliasName;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNo) {
            $res['legal_cert_no'] = $this->legalCertNo;
        }
        if (null !== $this->settleTarget) {
            $res['settle_target'] = $this->settleTarget;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIpAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['alipay_login_name'])) {
            $model->alipayLoginName = $map['alipay_login_name'];
        }
        if (isset($map['merchant_type'])) {
            $model->merchantType = $map['merchant_type'];
        }
        if (isset($map['merchant_alias_name'])) {
            $model->merchantAliasName = $map['merchant_alias_name'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_no'])) {
            $model->legalCertNo = $map['legal_cert_no'];
        }
        if (isset($map['settle_target'])) {
            $model->settleTarget = $map['settle_target'];
        }

        return $model;
    }
}
