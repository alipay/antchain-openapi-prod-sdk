<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRbbGeneralRequest extends Model
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

    // 额外参数json
    /**
     * @var string
     */
    public $extension;

    // 通用查询名称
    /**
     * @var string
     */
    public $queryname;

    // 查询参数JSON字符串
    /**
     * @var string
     */
    public $queryparas;

    // 虚拟云租户code
    /**
     * @var string
     */
    public $virtualCloudTenantCode;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'extension'              => 'extension',
        'queryname'              => 'queryname',
        'queryparas'             => 'queryparas',
        'virtualCloudTenantCode' => 'virtual_cloud_tenant_code',
    ];

    public function validate()
    {
        Model::validateRequired('queryname', $this->queryname, true);
        Model::validateMaxLength('queryname', $this->queryname, 200);
        Model::validateMinLength('queryname', $this->queryname, 2);
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
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->queryname) {
            $res['queryname'] = $this->queryname;
        }
        if (null !== $this->queryparas) {
            $res['queryparas'] = $this->queryparas;
        }
        if (null !== $this->virtualCloudTenantCode) {
            $res['virtual_cloud_tenant_code'] = $this->virtualCloudTenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRbbGeneralRequest
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
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['queryname'])) {
            $model->queryname = $map['queryname'];
        }
        if (isset($map['queryparas'])) {
            $model->queryparas = $map['queryparas'];
        }
        if (isset($map['virtual_cloud_tenant_code'])) {
            $model->virtualCloudTenantCode = $map['virtual_cloud_tenant_code'];
        }

        return $model;
    }
}
