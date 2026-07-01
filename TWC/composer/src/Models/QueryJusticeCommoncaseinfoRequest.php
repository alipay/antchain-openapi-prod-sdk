<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeCommoncaseinfoRequest extends Model
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

    // 案件号
    /**
     * @var string
     */
    public $caseNo;

    // 用户幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'caseNo'            => 'case_no',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('caseNo', $this->caseNo, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeCommoncaseinfoRequest
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
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
