<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class BindCutpaymentOneclickRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 银行编号
    /**
     * @var string
     */
    public $bankCode;

    // 银行卡类型，
    // 0：借记卡
    // 1：信用卡
    /**
     * @var string
     */
    public $cardType;

    // 证件类型，
    // 0：身份证
    // 1：港澳居民居住证
    // 2：台湾居民居住证
    /**
     * @var string
     */
    public $idCardType;

    // 姓名
    /**
     * @var string
     */
    public $certName;

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 页面返回地址，
    // 签约完成，页面跳转地址，注：地址后不能带参数
    /**
     * @var string
     */
    public $pageUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outerOrderNo'      => 'outer_order_no',
        'userId'            => 'user_id',
        'bankCode'          => 'bank_code',
        'cardType'          => 'card_type',
        'idCardType'        => 'id_card_type',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'pageUrl'           => 'page_url',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('bankCode', $this->bankCode, true);
        Model::validateRequired('cardType', $this->cardType, true);
        Model::validateRequired('idCardType', $this->idCardType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('pageUrl', $this->pageUrl, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->bankCode) {
            $res['bank_code'] = $this->bankCode;
        }
        if (null !== $this->cardType) {
            $res['card_type'] = $this->cardType;
        }
        if (null !== $this->idCardType) {
            $res['id_card_type'] = $this->idCardType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->pageUrl) {
            $res['page_url'] = $this->pageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindCutpaymentOneclickRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['bank_code'])) {
            $model->bankCode = $map['bank_code'];
        }
        if (isset($map['card_type'])) {
            $model->cardType = $map['card_type'];
        }
        if (isset($map['id_card_type'])) {
            $model->idCardType = $map['id_card_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['page_url'])) {
            $model->pageUrl = $map['page_url'];
        }

        return $model;
    }
}
