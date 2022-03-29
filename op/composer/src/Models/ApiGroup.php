<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiGroup extends Model
{
    // 分组名称
    /**
     * @example demo
     *
     * @var string
     */
    public $name;

    // 分组描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // api类型
    /**
     * @example SPI
     *
     * @var ApiGroupTypeEnum
     */
    public $type;

    // 产品
    /**
     * @example demo
     *
     * @var string
     */
    public $providerId;

    // 套件id
    /**
     * @example 0000000614
     *
     * @var string
     */
    public $apiSuiteId;
    protected $_name = [
        'name'        => 'name',
        'description' => 'description',
        'type'        => 'type',
        'providerId'  => 'provider_id',
        'apiSuiteId'  => 'api_suite_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('apiSuiteId', $this->apiSuiteId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = null !== $this->type ? $this->type->toMap() : null;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->apiSuiteId) {
            $res['api_suite_id'] = $this->apiSuiteId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = ApiGroupTypeEnum::fromMap($map['type']);
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['api_suite_id'])) {
            $model->apiSuiteId = $map['api_suite_id'];
        }

        return $model;
    }
}
