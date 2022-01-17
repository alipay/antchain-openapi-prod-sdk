<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ImportResult extends Model
{
    // code
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // 覆盖报错的配置
    /**
     * @example apiGroup，systemCluster，externalAuth，paramMapping，routerInfo，corsInfo
     *
     * @var string
     */
    public $errorConfig;

    // error_message
    /**
     * @example error_message
     *
     * @var string
     */
    public $errorMessage;

    // API的ID
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // API的名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 覆盖成功的标识
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 覆盖失败的配置名称
    /**
     * @example config_name
     *
     * @var string
     */
    public $configName;
    protected $_name = [
        'code'         => 'code',
        'errorConfig'  => 'error_config',
        'errorMessage' => 'error_message',
        'id'           => 'id',
        'name'         => 'name',
        'success'      => 'success',
        'configName'   => 'config_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errorConfig) {
            $res['error_config'] = $this->errorConfig;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->configName) {
            $res['config_name'] = $this->configName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['error_config'])) {
            $model->errorConfig = $map['error_config'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['config_name'])) {
            $model->configName = $map['config_name'];
        }

        return $model;
    }
}
