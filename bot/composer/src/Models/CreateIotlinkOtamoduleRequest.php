<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateIotlinkOtamoduleRequest extends Model
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

    // OTA模块名称，产品下唯一且不可修改。仅支持英文字母、数字、英文句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
    // 英文字母不区分大小写，例如“scanner”和“Scanner”被认为是相同的模块名称，不可重复使用
    /**
     * @var string
     */
    public $moduleName;

    // OTA模块别名。支持中文、英文字母、数字、英文句号（.）、短划线（-）和下划线（_），长度限制为1~64个字符。
    /**
     * @var string
     */
    public $aliasName;

    // OTA模块的描述信息，支持最多100个字符。
    /**
     * @var string
     */
    public $desc;

    // 项目编码
    /**
     * @var string
     */
    public $projectCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'categoryCode'      => 'category_code',
        'moduleName'        => 'module_name',
        'aliasName'         => 'alias_name',
        'desc'              => 'desc',
        'projectCode'       => 'project_code',
    ];

    public function validate()
    {
        Model::validateRequired('categoryCode', $this->categoryCode, true);
        Model::validateRequired('moduleName', $this->moduleName, true);
        Model::validateRequired('projectCode', $this->projectCode, true);
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
        if (null !== $this->aliasName) {
            $res['alias_name'] = $this->aliasName;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIotlinkOtamoduleRequest
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
        if (isset($map['alias_name'])) {
            $model->aliasName = $map['alias_name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }

        return $model;
    }
}
