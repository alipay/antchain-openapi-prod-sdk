<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QueryProdinstanceAppserviceRequest extends Model
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

    // 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
    /**
     * @var string
     */
    public $appName;

    // 单元ID
    /**
     * @var string
     */
    public $cellId;

    // 部署单元。
    /**
     * @var string
     */
    public $deployUnit;

    // 部署域。当前版本暂不支持。
    /**
     * @var string
     */
    public $deployZone;

    // 环境唯一标识。
    /**
     * @var string
     */
    public $envId;

    // 当前页码，默认为1。
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10，最大100。
    /**
     * @var int
     */
    public $pageSize;

    // 产品码。
    /**
     * @var string
     */
    public $productCode;

    // 产品分组。如果入参设置了产品码，则默认忽略产品分组。
    /**
     * @var string
     */
    public $productGroup;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'cellId'            => 'cell_id',
        'deployUnit'        => 'deploy_unit',
        'deployZone'        => 'deploy_zone',
        'envId'             => 'env_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'productCode'       => 'product_code',
        'productGroup'      => 'product_group',
    ];

    public function validate()
    {
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->cellId) {
            $res['cell_id'] = $this->cellId;
        }
        if (null !== $this->deployUnit) {
            $res['deploy_unit'] = $this->deployUnit;
        }
        if (null !== $this->deployZone) {
            $res['deploy_zone'] = $this->deployZone;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productGroup) {
            $res['product_group'] = $this->productGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProdinstanceAppserviceRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['cell_id'])) {
            $model->cellId = $map['cell_id'];
        }
        if (isset($map['deploy_unit'])) {
            $model->deployUnit = $map['deploy_unit'];
        }
        if (isset($map['deploy_zone'])) {
            $model->deployZone = $map['deploy_zone'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_group'])) {
            $model->productGroup = $map['product_group'];
        }

        return $model;
    }
}
