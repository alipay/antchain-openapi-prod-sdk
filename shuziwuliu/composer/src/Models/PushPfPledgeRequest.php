<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PushPfPledgeRequest extends Model
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

    // 项目标识，可联系对接同学提供
    /**
     * @var string
     */
    public $projectId;

    // 账单标识
    /**
     * @var string
     */
    public $billId;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
    /**
     * @var string
     */
    public $requestNo;

    // 质押发票号码列表
    /**
     * @var string[]
     */
    public $invoiceNos;

    // 托盘账单金额
    /**
     * @var string
     */
    public $palletBillAmount;

    // 托盘账单关联发票号列表
    /**
     * @var string[]
     */
    public $palletInvoiceNos;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'projectId'           => 'project_id',
        'billId'              => 'bill_id',
        'financingSubjectDid' => 'financing_subject_did',
        'requestNo'           => 'request_no',
        'invoiceNos'          => 'invoice_nos',
        'palletBillAmount'    => 'pallet_bill_amount',
        'palletInvoiceNos'    => 'pallet_invoice_nos',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('billId', $this->billId, true);
        Model::validateRequired('financingSubjectDid', $this->financingSubjectDid, true);
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateMaxLength('projectId', $this->projectId, 64);
        Model::validateMaxLength('billId', $this->billId, 128);
        Model::validateMaxLength('financingSubjectDid', $this->financingSubjectDid, 128);
        Model::validateMaxLength('requestNo', $this->requestNo, 32);
        Model::validateMaxLength('palletBillAmount', $this->palletBillAmount, 64);
        Model::validateMinLength('billId', $this->billId, 1);
        Model::validateMinLength('financingSubjectDid', $this->financingSubjectDid, 1);
        Model::validateMinLength('requestNo', $this->requestNo, 16);
        Model::validateMinLength('palletBillAmount', $this->palletBillAmount, 1);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->invoiceNos) {
            $res['invoice_nos'] = $this->invoiceNos;
        }
        if (null !== $this->palletBillAmount) {
            $res['pallet_bill_amount'] = $this->palletBillAmount;
        }
        if (null !== $this->palletInvoiceNos) {
            $res['pallet_invoice_nos'] = $this->palletInvoiceNos;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushPfPledgeRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['invoice_nos'])) {
            if (!empty($map['invoice_nos'])) {
                $model->invoiceNos = $map['invoice_nos'];
            }
        }
        if (isset($map['pallet_bill_amount'])) {
            $model->palletBillAmount = $map['pallet_bill_amount'];
        }
        if (isset($map['pallet_invoice_nos'])) {
            if (!empty($map['pallet_invoice_nos'])) {
                $model->palletInvoiceNos = $map['pallet_invoice_nos'];
            }
        }

        return $model;
    }
}
