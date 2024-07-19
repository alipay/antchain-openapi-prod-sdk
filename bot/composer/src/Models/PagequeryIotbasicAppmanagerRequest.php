<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIotbasicAppmanagerRequest extends Model
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

    // 所属项目空间
    /**
     * @var string
     */
    public $projectSpace;

    // 应用名称
    /**
     * @var string
     */
    public $apkName;

    // 应用版本号
    /**
     * @var string
     */
    public $apkVersion;

    // 当前页
    // 默认第一页
    /**
     * @var int
     */
    public $current;

    // 每页数量
    // 默认20条，最大100条
    /**
     * @var int
     */
    public $pageSize;

    // 品类code
    /**
     * @var string
     */
    public $categoryCode;

    // 应用模块名称，由查询应用类型列表获取
    /**
     * @var string
     */
    public $moduleName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectSpace'      => 'project_space',
        'apkName'           => 'apk_name',
        'apkVersion'        => 'apk_version',
        'current'           => 'current',
        'pageSize'          => 'page_size',
        'categoryCode'      => 'category_code',
        'moduleName'        => 'module_name',
    ];

    public function validate()
    {
        Model::validateRequired('projectSpace', $this->projectSpace, true);
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->projectSpace) {
            $res['project_space'] = $this->projectSpace;
        }
        if (null !== $this->apkName) {
            $res['apk_name'] = $this->apkName;
        }
        if (null !== $this->apkVersion) {
            $res['apk_version'] = $this->apkVersion;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
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
     * @return PagequeryIotbasicAppmanagerRequest
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
        if (isset($map['project_space'])) {
            $model->projectSpace = $map['project_space'];
        }
        if (isset($map['apk_name'])) {
            $model->apkName = $map['apk_name'];
        }
        if (isset($map['apk_version'])) {
            $model->apkVersion = $map['apk_version'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
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
