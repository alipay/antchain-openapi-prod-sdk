<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeleteIotbasicAppmanagerotamoduleRequest extends Model
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

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 要删除的OTA模块名称。
    /**
     * @var string
     */
    public $moduleName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'moduleName'        => 'module_name',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('moduleName', $this->moduleName, true);
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
        if (null !== $this->categoryCode) {
            $res['category_code'] = $this->categoryCode;
        }
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteIotbasicAppmanagerotamoduleRequest
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
        if (isset($map['category_code'])) {
            $model->categoryCode = $map['category_code'];
        }
        if (isset($map['module_name'])) {
            $model->moduleName = $map['module_name'];
        }

        return $model;
    }
}
