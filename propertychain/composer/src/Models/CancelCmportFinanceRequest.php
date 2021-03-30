<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CancelCmportFinanceRequest extends Model
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

    // 平台融资编号
    /**
     * @var string
     */
    public $financialNo;

    // 融资企业编码
    /**
     * @var string
     */
    public $companyCode;

    // 融资企业名称
    /**
     * @var string
     */
    public $companyName;

    // 撤销申请日期
    /**
     * @var string
     */
    public $cancelApplyDate;

    // 撤销申请描述
    /**
     * @var string
     */
    public $cancelApplyDesc;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    /**
     * @var int
     */
    public $financialStatus;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // Channel 名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'financialNo'       => 'financial_no',
        'companyCode'       => 'company_code',
        'companyName'       => 'company_name',
        'cancelApplyDate'   => 'cancel_apply_date',
        'cancelApplyDesc'   => 'cancel_apply_desc',
        'financialStatus'   => 'financial_status',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('companyCode', $this->companyCode, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('cancelApplyDate', $this->cancelApplyDate, true);
        Model::validateRequired('cancelApplyDesc', $this->cancelApplyDesc, true);
        Model::validateRequired('financialStatus', $this->financialStatus, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validatePattern('cancelApplyDate', $this->cancelApplyDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->companyCode) {
            $res['company_code'] = $this->companyCode;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->cancelApplyDate) {
            $res['cancel_apply_date'] = $this->cancelApplyDate;
        }
        if (null !== $this->cancelApplyDesc) {
            $res['cancel_apply_desc'] = $this->cancelApplyDesc;
        }
        if (null !== $this->financialStatus) {
            $res['financial_status'] = $this->financialStatus;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelCmportFinanceRequest
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
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['company_code'])) {
            $model->companyCode = $map['company_code'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['cancel_apply_date'])) {
            $model->cancelApplyDate = $map['cancel_apply_date'];
        }
        if (isset($map['cancel_apply_desc'])) {
            $model->cancelApplyDesc = $map['cancel_apply_desc'];
        }
        if (isset($map['financial_status'])) {
            $model->financialStatus = $map['financial_status'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
