<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyCmportBankRequest extends Model
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

    // 审核人
    /**
     * @var string
     */
    public $auditor;

    // 审核时间
    /**
     * @var string
     */
    public $auditDate;

    // 审核评论
    /**
     * @var string
     */
    public $auditComment;

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
        'auditor'           => 'auditor',
        'auditDate'         => 'audit_date',
        'auditComment'      => 'audit_comment',
        'financialStatus'   => 'financial_status',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'channelName'       => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('auditor', $this->auditor, true);
        Model::validateRequired('auditDate', $this->auditDate, true);
        Model::validateRequired('auditComment', $this->auditComment, true);
        Model::validateRequired('financialStatus', $this->financialStatus, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validatePattern('auditDate', $this->auditDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->auditor) {
            $res['auditor'] = $this->auditor;
        }
        if (null !== $this->auditDate) {
            $res['audit_date'] = $this->auditDate;
        }
        if (null !== $this->auditComment) {
            $res['audit_comment'] = $this->auditComment;
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
     * @return NotifyCmportBankRequest
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
        if (isset($map['auditor'])) {
            $model->auditor = $map['auditor'];
        }
        if (isset($map['audit_date'])) {
            $model->auditDate = $map['audit_date'];
        }
        if (isset($map['audit_comment'])) {
            $model->auditComment = $map['audit_comment'];
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
