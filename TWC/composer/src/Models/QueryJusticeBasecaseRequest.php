<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeBasecaseRequest extends Model
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

    // 针对案件信息查询的索引方式，01为根据案件caseID索引，02为根据申请人的统一社会信用代码与业务订单号进行索引
    /**
     * @var string
     */
    public $indexMethod;

    // 纠纷处理平台后台唯一的caseID 当索引方式为01时必填
    /**
     * @var string
     */
    public $caseId;

    // 案件申请人（企业）的统一社会信用代码 当索引方式为02时必填
    /**
     * @var string
     */
    public $idNumber;

    // 案件的业务订单ID 当索引方式为02时必填
    /**
     * @var string
     */
    public $businessNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'indexMethod'       => 'index_method',
        'caseId'            => 'case_id',
        'idNumber'          => 'id_number',
        'businessNumber'    => 'business_number',
    ];

    public function validate()
    {
        Model::validateRequired('indexMethod', $this->indexMethod, true);
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
        if (null !== $this->indexMethod) {
            $res['index_method'] = $this->indexMethod;
        }
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->businessNumber) {
            $res['business_number'] = $this->businessNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeBasecaseRequest
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
        if (isset($map['index_method'])) {
            $model->indexMethod = $map['index_method'];
        }
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['business_number'])) {
            $model->businessNumber = $map['business_number'];
        }

        return $model;
    }
}
