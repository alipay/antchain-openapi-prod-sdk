<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeEcloanRequest extends Model
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

    // 业务场景
    /**
     * @var string
     */
    public $businessScene;

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 合同编号
    /**
     * @var string
     */
    public $contractNo;

    // 申请单号
    /**
     * @var string
     */
    public $orderNo;

    // 页码
    /**
     * @var string
     */
    public $pageNo;

    // 每页条数
    /**
     * @var string
     */
    public $pageSize;

    // 申请人身份证号码
    /**
     * @var string
     */
    public $applicantIdNo;

    // 企业证件号码 当申请人身份证号码为空时,企业证件号码不允许为空
    /**
     * @var string
     */
    public $entIdNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessScene'     => 'business_scene',
        'transactionNo'     => 'transaction_no',
        'contractNo'        => 'contract_no',
        'orderNo'           => 'order_no',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
        'applicantIdNo'     => 'applicant_id_no',
        'entIdNo'           => 'ent_id_no',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('contractNo', $this->contractNo, true);
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
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->contractNo) {
            $res['contract_no'] = $this->contractNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->applicantIdNo) {
            $res['applicant_id_no'] = $this->applicantIdNo;
        }
        if (null !== $this->entIdNo) {
            $res['ent_id_no'] = $this->entIdNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeEcloanRequest
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
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['contract_no'])) {
            $model->contractNo = $map['contract_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['applicant_id_no'])) {
            $model->applicantIdNo = $map['applicant_id_no'];
        }
        if (isset($map['ent_id_no'])) {
            $model->entIdNo = $map['ent_id_no'];
        }

        return $model;
    }
}
