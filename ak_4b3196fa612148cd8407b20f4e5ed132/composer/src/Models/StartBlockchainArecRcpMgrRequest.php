<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class StartBlockchainArecRcpMgrRequest extends Model
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

    // 助贷平台
    /**
     * @var string
     */
    public $loanAssistPlatform;

    // 房产链内部银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 外部业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 不动产颁发的他项权证号
    /**
     * @var string
     */
    public $otherRightCertNo;

    // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
    /**
     * @var string
     */
    public $wipeMortgageReason;

    // 解抵押的房产信息
    /**
     * @var House
     */
    public $house;

    // 办理业务分支行
    /**
     * @var Bank
     */
    public $branchBank;

    // 解抵押单号
    /**
     * @var string
     */
    public $mgReleaseOrderNo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'outBizNo'           => 'out_biz_no',
        'otherRightCertNo'   => 'other_right_cert_no',
        'wipeMortgageReason' => 'wipe_mortgage_reason',
        'house'              => 'house',
        'branchBank'         => 'branch_bank',
        'mgReleaseOrderNo'   => 'mg_release_order_no',
    ];

    public function validate()
    {
        Model::validateRequired('loanAssistPlatform', $this->loanAssistPlatform, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('otherRightCertNo', $this->otherRightCertNo, true);
        Model::validateRequired('wipeMortgageReason', $this->wipeMortgageReason, true);
        Model::validateRequired('house', $this->house, true);
        Model::validateRequired('branchBank', $this->branchBank, true);
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
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->otherRightCertNo) {
            $res['other_right_cert_no'] = $this->otherRightCertNo;
        }
        if (null !== $this->wipeMortgageReason) {
            $res['wipe_mortgage_reason'] = $this->wipeMortgageReason;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }
        if (null !== $this->mgReleaseOrderNo) {
            $res['mg_release_order_no'] = $this->mgReleaseOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartBlockchainArecRcpMgrRequest
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
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['other_right_cert_no'])) {
            $model->otherRightCertNo = $map['other_right_cert_no'];
        }
        if (isset($map['wipe_mortgage_reason'])) {
            $model->wipeMortgageReason = $map['wipe_mortgage_reason'];
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }
        if (isset($map['mg_release_order_no'])) {
            $model->mgReleaseOrderNo = $map['mg_release_order_no'];
        }

        return $model;
    }
}
