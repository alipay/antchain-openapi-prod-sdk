<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class CorsInfoVO extends Model
{
    // 是否允许发送COOKIE
    /**
     * @example true, false
     *
     * @var bool
     */
    public $allowCredentials;

    // 允许的 request headers
    /**
     * @example
     *
     * @var string[]
     */
    public $allowHeaders;

    // 允许的http method
    /**
     * @example
     *
     * @var string[]
     */
    public $allowMethods;

    // 允许的 ORIGIN
    /**
     * @example
     *
     * @var string[]
     */
    public $allowOrigins;

    // API数量
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // cors标识
    /**
     * @example cors_id1
     *
     * @var string
     */
    public $corsId;

    // cors名称
    /**
     * @example cors_name1
     *
     * @var string
     */
    public $corsName;

    // cors_scop
    /**
     * @example WORKSPACE/API
     *
     * @var string
     */
    public $corsScop;

    // cors状态
    /**
     * @example CLOSED/OPENED
     *
     * @var string
     */
    public $corsStatus;

    // 允许暴露的 reponse header
    /**
     * @example
     *
     * @var string[]
     */
    public $exposeHeaders;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 预检请求的有效期
    /**
     * @example
     *
     * @var int
     */
    public $maxAge;

    // 创建人
    /**
     * @example scott
     *
     * @var string
     */
    public $operator;

    // 租户标识
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'allowCredentials' => 'allow_credentials',
        'allowHeaders'     => 'allow_headers',
        'allowMethods'     => 'allow_methods',
        'allowOrigins'     => 'allow_origins',
        'apiCount'         => 'api_count',
        'corsId'           => 'cors_id',
        'corsName'         => 'cors_name',
        'corsScop'         => 'cors_scop',
        'corsStatus'       => 'cors_status',
        'exposeHeaders'    => 'expose_headers',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'maxAge'           => 'max_age',
        'operator'         => 'operator',
        'tenantId'         => 'tenant_id',
        'workspaceId'      => 'workspace_id',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->allowCredentials) {
            $res['allow_credentials'] = $this->allowCredentials;
        }
        if (null !== $this->allowHeaders) {
            $res['allow_headers'] = $this->allowHeaders;
        }
        if (null !== $this->allowMethods) {
            $res['allow_methods'] = $this->allowMethods;
        }
        if (null !== $this->allowOrigins) {
            $res['allow_origins'] = $this->allowOrigins;
        }
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->corsId) {
            $res['cors_id'] = $this->corsId;
        }
        if (null !== $this->corsName) {
            $res['cors_name'] = $this->corsName;
        }
        if (null !== $this->corsScop) {
            $res['cors_scop'] = $this->corsScop;
        }
        if (null !== $this->corsStatus) {
            $res['cors_status'] = $this->corsStatus;
        }
        if (null !== $this->exposeHeaders) {
            $res['expose_headers'] = $this->exposeHeaders;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->maxAge) {
            $res['max_age'] = $this->maxAge;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CorsInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['allow_credentials'])) {
            $model->allowCredentials = $map['allow_credentials'];
        }
        if (isset($map['allow_headers'])) {
            if (!empty($map['allow_headers'])) {
                $model->allowHeaders = $map['allow_headers'];
            }
        }
        if (isset($map['allow_methods'])) {
            if (!empty($map['allow_methods'])) {
                $model->allowMethods = $map['allow_methods'];
            }
        }
        if (isset($map['allow_origins'])) {
            if (!empty($map['allow_origins'])) {
                $model->allowOrigins = $map['allow_origins'];
            }
        }
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['cors_id'])) {
            $model->corsId = $map['cors_id'];
        }
        if (isset($map['cors_name'])) {
            $model->corsName = $map['cors_name'];
        }
        if (isset($map['cors_scop'])) {
            $model->corsScop = $map['cors_scop'];
        }
        if (isset($map['cors_status'])) {
            $model->corsStatus = $map['cors_status'];
        }
        if (isset($map['expose_headers'])) {
            if (!empty($map['expose_headers'])) {
                $model->exposeHeaders = $map['expose_headers'];
            }
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['max_age'])) {
            $model->maxAge = $map['max_age'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
