<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCertificateLxRequest extends Model
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

    // 放款请求流水号
    /**
     * @var string
     */
    public $loanReqNo;

    // 请求方代码
    /**
     * @var string
     */
    public $sourceCode;

    // 文件类型，0结清证明
    // 1代偿凭证
    // 2放款凭证
    /**
     * @var int
     */
    public $fileType;

    // 申请日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $applyDate;

    // 业务类型，
    // 1非乐花卡
    // 2乐花卡
    /**
     * @var int
     */
    public $businessType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'loanReqNo'         => 'loan_req_no',
        'sourceCode'        => 'source_code',
        'fileType'          => 'file_type',
        'applyDate'         => 'apply_date',
        'businessType'      => 'business_type',
    ];

    public function validate()
    {
        Model::validateRequired('loanReqNo', $this->loanReqNo, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('applyDate', $this->applyDate, true);
        Model::validateRequired('businessType', $this->businessType, true);
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
        if (null !== $this->loanReqNo) {
            $res['loan_req_no'] = $this->loanReqNo;
        }
        if (null !== $this->sourceCode) {
            $res['source_code'] = $this->sourceCode;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCertificateLxRequest
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
        if (isset($map['loan_req_no'])) {
            $model->loanReqNo = $map['loan_req_no'];
        }
        if (isset($map['source_code'])) {
            $model->sourceCode = $map['source_code'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }

        return $model;
    }
}
