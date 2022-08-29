<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GetDciPayurlRequest extends Model
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

    // dci用户id
    /**
     * @var string
     */
    public $dciUserId;

    // dci内容id
    /**
     * @var string
     */
    public $dciContentId;

    // 支付方式 0：支付宝
    /**
     * @var string
     */
    public $payMent;

    // 发票信息-当前支持普票
    /**
     * @var InvoiceInfo
     */
    public $invoiceInfo;

    // 客户端token，幂等号，用来保证并发请求幂等性
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dciUserId'         => 'dci_user_id',
        'dciContentId'      => 'dci_content_id',
        'payMent'           => 'pay_ment',
        'invoiceInfo'       => 'invoice_info',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('dciUserId', $this->dciUserId, true);
        Model::validateRequired('dciContentId', $this->dciContentId, true);
        Model::validateRequired('invoiceInfo', $this->invoiceInfo, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }
        if (null !== $this->payMent) {
            $res['pay_ment'] = $this->payMent;
        }
        if (null !== $this->invoiceInfo) {
            $res['invoice_info'] = null !== $this->invoiceInfo ? $this->invoiceInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDciPayurlRequest
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
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }
        if (isset($map['pay_ment'])) {
            $model->payMent = $map['pay_ment'];
        }
        if (isset($map['invoice_info'])) {
            $model->invoiceInfo = InvoiceInfo::fromMap($map['invoice_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
