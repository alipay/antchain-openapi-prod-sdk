<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepayofflineaccountRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo' => 'order_no',
        'useCreditOrderNo' => 'use_credit_order_no',
        'startDate' => 'start_date',
        'endDate' => 'end_date',
        'accountNo' => 'account_no',
        'dcFlag' => 'dc_flag',
        'currentPage' => 'current_page',
        'pageNum' => 'page_num',
    ];
    public function validate() {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('useCreditOrderNo', $this->useCreditOrderNo, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('accountNo', $this->accountNo, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->useCreditOrderNo) {
            $res['use_credit_order_no'] = $this->useCreditOrderNo;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->dcFlag) {
            $res['dc_flag'] = $this->dcFlag;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgeRepayofflineaccountRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['use_credit_order_no'])){
            $model->useCreditOrderNo = $map['use_credit_order_no'];
        }
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        if(isset($map['end_date'])){
            $model->endDate = $map['end_date'];
        }
        if(isset($map['account_no'])){
            $model->accountNo = $map['account_no'];
        }
        if(isset($map['dc_flag'])){
            $model->dcFlag = $map['dc_flag'];
        }
        if(isset($map['current_page'])){
            $model->currentPage = $map['current_page'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求唯一id
    /**
     * @var string
     */
    public $orderNo;

    // 关联的天枢用信申请订单号
    /**
     * @var string
     */
    public $useCreditOrderNo;

    // 开始日期
    /**
     * @var string
     */
    public $startDate;

    // 结束日期
    /**
     * @var string
     */
    public $endDate;

    // 账号
    /**
     * @var string
     */
    public $accountNo;

    // 借贷标识:D-借,C-贷
    /**
     * @var string
     */
    public $dcFlag;

    // 当前页码
    /**
     * @var string
     */
    public $currentPage;

    // 每页记录数
    /**
     * @var string
     */
    public $pageNum;

}
