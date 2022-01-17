<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class EngineVO extends Model
{
    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // 流程编排标识
    /**
     * @example template_id
     *
     * @var string
     */
    public $templateId;

    // 内嵌模式、云端模式
    /**
     * @example simple、cafeflow
     *
     * @var string
     */
    public $engineType;

    // add_request
    /**
     * @example true
     *
     * @var bool
     */
    public $addRequest;

    // add_timestamp
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addTimestamp;

    // save_to_db
    /**
     * @example true, false
     *
     * @var bool
     */
    public $saveToDb;

    // 流程编排  （内嵌模式）初始化的入参
    /**
     * @example {"person":2}
     *
     * @var string
     */
    public $params;
    protected $_name = [
        'tenantId'     => 'tenant_id',
        'workspaceId'  => 'workspace_id',
        'templateId'   => 'template_id',
        'engineType'   => 'engine_type',
        'addRequest'   => 'add_request',
        'addTimestamp' => 'add_timestamp',
        'saveToDb'     => 'save_to_db',
        'params'       => 'params',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->engineType) {
            $res['engine_type'] = $this->engineType;
        }
        if (null !== $this->addRequest) {
            $res['add_request'] = $this->addRequest;
        }
        if (null !== $this->addTimestamp) {
            $res['add_timestamp'] = $this->addTimestamp;
        }
        if (null !== $this->saveToDb) {
            $res['save_to_db'] = $this->saveToDb;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EngineVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['engine_type'])) {
            $model->engineType = $map['engine_type'];
        }
        if (isset($map['add_request'])) {
            $model->addRequest = $map['add_request'];
        }
        if (isset($map['add_timestamp'])) {
            $model->addTimestamp = $map['add_timestamp'];
        }
        if (isset($map['save_to_db'])) {
            $model->saveToDb = $map['save_to_db'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
