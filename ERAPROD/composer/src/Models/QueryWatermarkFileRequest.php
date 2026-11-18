<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ERAPROD\Models;

use AlibabaCloud\Tea\Model;

class QueryWatermarkFileRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'datumItemCode' => 'datum_item_code',
        'employeeNo' => 'employee_no',
        'projectId' => 'project_id',
        'tenderResourceId' => 'tender_resource_id',
    ];
    public function validate() {
        Model::validateRequired('datumItemCode', $this->datumItemCode, true);
        Model::validateRequired('employeeNo', $this->employeeNo, true);
        Model::validateRequired('projectId', $this->projectId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->datumItemCode) {
            $res['datum_item_code'] = $this->datumItemCode;
        }
        if (null !== $this->employeeNo) {
            $res['employee_no'] = $this->employeeNo;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->tenderResourceId) {
            $res['tender_resource_id'] = $this->tenderResourceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWatermarkFileRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['datum_item_code'])){
            $model->datumItemCode = $map['datum_item_code'];
        }
        if(isset($map['employee_no'])){
            $model->employeeNo = $map['employee_no'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['tender_resource_id'])){
            $model->tenderResourceId = $map['tender_resource_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 资料id
    /**
     * @var string
     */
    public $datumItemCode;

    // 工号
    /**
     * @var string
     */
    public $employeeNo;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 投标资源id
    /**
     * @var string
     */
    public $tenderResourceId;

}
