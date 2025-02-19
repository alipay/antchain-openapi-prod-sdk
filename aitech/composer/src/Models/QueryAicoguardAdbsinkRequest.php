<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryAicoguardAdbsinkRequest extends Model
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

    // 区域id
    /**
     * @var string
     */
    public $regionId;

    // DB实例id
    /**
     * @var string
     */
    public $dbInstanceId;

    // 数据库空间名称
    /**
     * @var string
     */
    public $nameSpace;

    // 数据库空间密码
    /**
     * @var string
     */
    public $nameSpacePassword;

    // 数据库表名
    /**
     * @var string
     */
    public $collectionName;

    // 要查询的内容
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionId'          => 'region_id',
        'dbInstanceId'      => 'db_instance_id',
        'nameSpace'         => 'name_space',
        'nameSpacePassword' => 'name_space_password',
        'collectionName'    => 'collection_name',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('dbInstanceId', $this->dbInstanceId, true);
        Model::validateRequired('nameSpace', $this->nameSpace, true);
        Model::validateRequired('nameSpacePassword', $this->nameSpacePassword, true);
        Model::validateRequired('collectionName', $this->collectionName, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->dbInstanceId) {
            $res['db_instance_id'] = $this->dbInstanceId;
        }
        if (null !== $this->nameSpace) {
            $res['name_space'] = $this->nameSpace;
        }
        if (null !== $this->nameSpacePassword) {
            $res['name_space_password'] = $this->nameSpacePassword;
        }
        if (null !== $this->collectionName) {
            $res['collection_name'] = $this->collectionName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAicoguardAdbsinkRequest
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
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['db_instance_id'])) {
            $model->dbInstanceId = $map['db_instance_id'];
        }
        if (isset($map['name_space'])) {
            $model->nameSpace = $map['name_space'];
        }
        if (isset($map['name_space_password'])) {
            $model->nameSpacePassword = $map['name_space_password'];
        }
        if (isset($map['collection_name'])) {
            $model->collectionName = $map['collection_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
