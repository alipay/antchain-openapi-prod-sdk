<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SubmitDatalinkExportRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'configType' => 'config_type',
        'alias' => 'alias',
        'sql' => 'sql',
        'exportJobId' => 'export_job_id',
        'rowLimit' => 'row_limit',
        'sourceTenantId' => 'source_tenant_id',
    ];
    public function validate() {
        Model::validateRequired('configType', $this->configType, true);
        Model::validateRequired('alias', $this->alias, true);
        Model::validateRequired('sql', $this->sql, true);
        Model::validateRequired('exportJobId', $this->exportJobId, true);
        Model::validateRequired('rowLimit', $this->rowLimit, true);
        Model::validateRequired('sourceTenantId', $this->sourceTenantId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->configType) {
            $res['config_type'] = $this->configType;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->sql) {
            $res['sql'] = $this->sql;
        }
        if (null !== $this->exportJobId) {
            $res['export_job_id'] = $this->exportJobId;
        }
        if (null !== $this->rowLimit) {
            $res['row_limit'] = $this->rowLimit;
        }
        if (null !== $this->sourceTenantId) {
            $res['source_tenant_id'] = $this->sourceTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SubmitDatalinkExportRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['config_type'])){
            $model->configType = $map['config_type'];
        }
        if(isset($map['alias'])){
            $model->alias = $map['alias'];
        }
        if(isset($map['sql'])){
            $model->sql = $map['sql'];
        }
        if(isset($map['export_job_id'])){
            $model->exportJobId = $map['export_job_id'];
        }
        if(isset($map['row_limit'])){
            $model->rowLimit = $map['row_limit'];
        }
        if(isset($map['source_tenant_id'])){
            $model->sourceTenantId = $map['source_tenant_id'];
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

    // 数据源类型
    /**
     * @var string
     */
    public $configType;

    // 数据源别称
    /**
     * @var string
     */
    public $alias;

    // 执行SQL
    /**
     * @var string
     */
    public $sql;

    // 执行任务Id
    /**
     * @var string
     */
    public $exportJobId;

    // 返回最大条数
    /**
     * @var int
     */
    public $rowLimit;

    // 请求调用方原始租户ID
    /**
     * @var string
     */
    public $sourceTenantId;

}
