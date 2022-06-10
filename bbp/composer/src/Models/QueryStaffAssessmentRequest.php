<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryStaffAssessmentRequest extends Model
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

    // 员工工号
    /**
     * @var string
     */
    public $jobNumber;

    // 考核月份
    /**
     * @var string[]
     */
    public $scoreDates;

    // 供应商
    /**
     * @var string
     */
    public $supCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'jobNumber'         => 'job_number',
        'scoreDates'        => 'score_dates',
        'supCode'           => 'sup_code',
    ];

    public function validate()
    {
        Model::validateRequired('jobNumber', $this->jobNumber, true);
        Model::validateRequired('scoreDates', $this->scoreDates, true);
        Model::validateRequired('supCode', $this->supCode, true);
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
        if (null !== $this->jobNumber) {
            $res['job_number'] = $this->jobNumber;
        }
        if (null !== $this->scoreDates) {
            $res['score_dates'] = $this->scoreDates;
        }
        if (null !== $this->supCode) {
            $res['sup_code'] = $this->supCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStaffAssessmentRequest
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
        if (isset($map['job_number'])) {
            $model->jobNumber = $map['job_number'];
        }
        if (isset($map['score_dates'])) {
            if (!empty($map['score_dates'])) {
                $model->scoreDates = $map['score_dates'];
            }
        }
        if (isset($map['sup_code'])) {
            $model->supCode = $map['sup_code'];
        }

        return $model;
    }
}
