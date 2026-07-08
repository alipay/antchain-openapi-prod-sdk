<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddEcarOffsettranslateRequest extends Model
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

    // 转移业务流水单号
    /**
     * @var string
     */
    public $translationItemNo;

    // 碳补偿项目编号
    /**
     * @var string
     */
    public $projectNo;

    // 出账账户DID
    /**
     * @var string
     */
    public $drawingAccountDid;

    // 转移入账账户DID
    /**
     * @var string
     */
    public $receiptAccountDid;

    // 转移减碳量额度，最多六位小数
    /**
     * @var string
     */
    public $translationAmmount;

    // 业务类型包括，默认不需要传入，默认值为Translation
    /**
     * @var string
     */
    public $translationType;

    // 发生时间，格式为yyyy-MM-DD HH:MM:SS
    /**
     * @var string
     */
    public $occurrentTime;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'translationItemNo'  => 'translation_item_no',
        'projectNo'          => 'project_no',
        'drawingAccountDid'  => 'drawing_account_did',
        'receiptAccountDid'  => 'receipt_account_did',
        'translationAmmount' => 'translation_ammount',
        'translationType'    => 'translation_type',
        'occurrentTime'      => 'occurrent_time',
    ];

    public function validate()
    {
        Model::validateRequired('translationItemNo', $this->translationItemNo, true);
        Model::validateRequired('projectNo', $this->projectNo, true);
        Model::validateRequired('drawingAccountDid', $this->drawingAccountDid, true);
        Model::validateRequired('receiptAccountDid', $this->receiptAccountDid, true);
        Model::validateRequired('translationAmmount', $this->translationAmmount, true);
        Model::validateRequired('occurrentTime', $this->occurrentTime, true);
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
        if (null !== $this->translationItemNo) {
            $res['translation_item_no'] = $this->translationItemNo;
        }
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->drawingAccountDid) {
            $res['drawing_account_did'] = $this->drawingAccountDid;
        }
        if (null !== $this->receiptAccountDid) {
            $res['receipt_account_did'] = $this->receiptAccountDid;
        }
        if (null !== $this->translationAmmount) {
            $res['translation_ammount'] = $this->translationAmmount;
        }
        if (null !== $this->translationType) {
            $res['translation_type'] = $this->translationType;
        }
        if (null !== $this->occurrentTime) {
            $res['occurrent_time'] = $this->occurrentTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddEcarOffsettranslateRequest
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
        if (isset($map['translation_item_no'])) {
            $model->translationItemNo = $map['translation_item_no'];
        }
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['drawing_account_did'])) {
            $model->drawingAccountDid = $map['drawing_account_did'];
        }
        if (isset($map['receipt_account_did'])) {
            $model->receiptAccountDid = $map['receipt_account_did'];
        }
        if (isset($map['translation_ammount'])) {
            $model->translationAmmount = $map['translation_ammount'];
        }
        if (isset($map['translation_type'])) {
            $model->translationType = $map['translation_type'];
        }
        if (isset($map['occurrent_time'])) {
            $model->occurrentTime = $map['occurrent_time'];
        }

        return $model;
    }
}
