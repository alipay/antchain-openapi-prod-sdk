<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceYzbreportRequest extends Model
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

    // 保司编码，PAIC---平安、CPIC---太保
    //
    /**
     * @var string
     */
    public $externalChannelCode;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 报案号
    /**
     * @var string
     */
    public $reportNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'externalChannelCode' => 'external_channel_code',
        'policyNo'            => 'policy_no',
        'reportNo'            => 'report_no',
    ];

    public function validate()
    {
        Model::validateRequired('externalChannelCode', $this->externalChannelCode, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateMaxLength('externalChannelCode', $this->externalChannelCode, 10);
        Model::validateMaxLength('policyNo', $this->policyNo, 200);
        Model::validateMaxLength('reportNo', $this->reportNo, 100);
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
        if (null !== $this->externalChannelCode) {
            $res['external_channel_code'] = $this->externalChannelCode;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceYzbreportRequest
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
        if (isset($map['external_channel_code'])) {
            $model->externalChannelCode = $map['external_channel_code'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }

        return $model;
    }
}
