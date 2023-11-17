<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class PagequeryAntchainPdcpDatasourceRequest extends Model
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

    // 数据源名称，筛选用，非必填
    /**
     * @var string
     */
    public $name;

    // 数据源类型，筛选用，非必填。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // OSS,
    // MINIO
    /**
     * @var string
     */
    public $type;

    // 数据源是否可写，筛选用，非必填
    /**
     * @var bool
     */
    public $writable;

    // 分页页数，必填
    /**
     * @var int
     */
    public $page;

    // 分页大小，必填
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'type'              => 'type',
        'writable'          => 'writable',
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->writable) {
            $res['writable'] = $this->writable;
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
     * @return PagequeryAntchainPdcpDatasourceRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['writable'])) {
            $model->writable = $map['writable'];
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
