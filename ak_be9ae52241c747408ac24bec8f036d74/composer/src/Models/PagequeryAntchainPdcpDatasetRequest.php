<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class PagequeryAntchainPdcpDatasetRequest extends Model
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

    // 数据集名称
    /**
     * @var string
     */
    public $name;

    // 所属的数据源id，非必填
    /**
     * @var string
     */
    public $datasourceId;

    // 所属的数据源类型，非必填。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    /**
     * @var string
     */
    public $datasourceType;

    // 分页页数,不允许为空
    /**
     * @var int
     */
    public $page;

    // 分页大小，不允许为空
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'datasourceId'      => 'datasource_id',
        'datasourceType'    => 'datasource_type',
        'page'              => 'page',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateMinimum('page', $this->page, 1);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->datasourceId) {
            $res['datasource_id'] = $this->datasourceId;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryAntchainPdcpDatasetRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['datasource_id'])) {
            $model->datasourceId = $map['datasource_id'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
