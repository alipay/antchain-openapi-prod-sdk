<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'companyIds' => 'company_ids',
        'updateDate' => 'update_date',
    ];
    public function validate() {
        Model::validateRequired('companyIds', $this->companyIds, true);
        Model::validateRequired('updateDate', $this->updateDate, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->companyIds) {
            $res['company_ids'] = $this->companyIds;
        }
        if (null !== $this->updateDate) {
            $res['update_date'] = $this->updateDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRtopCompanyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['company_ids'])){
            if(!empty($map['company_ids'])){
                $model->companyIds = $map['company_ids'];
            }
        }
        if(isset($map['update_date'])){
            $model->updateDate = $map['update_date'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 公司ID集合
    /**
     * @var string[]
     */
    public $companyIds;

    // 数据同步到公有云时间(业务上赋值当天)
    /**
     * @var string
     */
    public $updateDate;

}
