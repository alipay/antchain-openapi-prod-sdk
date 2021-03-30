<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfFinancingqualificationRequest extends Model
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

    // 客户号
    /**
     * @var string
     */
    public $clientNo;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 借款人证件类型
    /**
     * @var string
     */
    public $borrowerCardType;

    // 借款人证件号码
    //
    //
    /**
     * @var string
     */
    public $borrowerCardNo;

    // 申请流水号
    /**
     * @var string
     */
    public $aplSeqNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'clientNo'            => 'client_no',
        'financingSubjectDid' => 'financing_subject_did',
        'borrowerCardType'    => 'borrower_card_type',
        'borrowerCardNo'      => 'borrower_card_no',
        'aplSeqNo'            => 'apl_seq_no',
    ];

    public function validate()
    {
        Model::validateRequired('clientNo', $this->clientNo, true);
        Model::validateRequired('financingSubjectDid', $this->financingSubjectDid, true);
        Model::validateRequired('borrowerCardType', $this->borrowerCardType, true);
        Model::validateRequired('borrowerCardNo', $this->borrowerCardNo, true);
        Model::validateRequired('aplSeqNo', $this->aplSeqNo, true);
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
        if (null !== $this->clientNo) {
            $res['client_no'] = $this->clientNo;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->borrowerCardType) {
            $res['borrower_card_type'] = $this->borrowerCardType;
        }
        if (null !== $this->borrowerCardNo) {
            $res['borrower_card_no'] = $this->borrowerCardNo;
        }
        if (null !== $this->aplSeqNo) {
            $res['apl_seq_no'] = $this->aplSeqNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfFinancingqualificationRequest
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
        if (isset($map['client_no'])) {
            $model->clientNo = $map['client_no'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['borrower_card_type'])) {
            $model->borrowerCardType = $map['borrower_card_type'];
        }
        if (isset($map['borrower_card_no'])) {
            $model->borrowerCardNo = $map['borrower_card_no'];
        }
        if (isset($map['apl_seq_no'])) {
            $model->aplSeqNo = $map['apl_seq_no'];
        }

        return $model;
    }
}
