<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBizPayinvoicefileRequest extends Model
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

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
    /**
     * @var string
     */
    public $action;

    // 发票文件hash [业务必填]
    /**
     * @var string
     */
    public $fileHash;

    // 发票文件ID [业务必填]
    /**
     * @var string
     */
    public $fileId;

    // 货代DID
    /**
     * @var string
     */
    public $forwarderDid;

    // 应付发票code
    /**
     * @var string
     */
    public $invoiceCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'action'            => 'action',
        'fileHash'          => 'file_hash',
        'fileId'            => 'file_id',
        'forwarderDid'      => 'forwarder_did',
        'invoiceCode'       => 'invoice_code',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('invoiceCode', $this->invoiceCode, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBizPayinvoicefileRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['file_hash'])) {
            $model->fileHash = $map['file_hash'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['invoice_code'])) {
            $model->invoiceCode = $map['invoice_code'];
        }

        return $model;
    }
}
