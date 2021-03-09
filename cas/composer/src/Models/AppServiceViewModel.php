<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppServiceViewModel extends Model
{
    // 基类
    /**
     * @example
     *
     * @var AppService
     */
    public $baseAppService;

    // 应用负责人姓名
    /**
     * @example ownerName
     *
     * @var string
     */
    public $ownerName;

    // 技术栈名称
    /**
     * @example buildpack_name
     *
     * @var string
     */
    public $buildpackName;

    // App的别名
    /**
     * @example chinese_name
     *
     * @var string
     */
    public $chineseName;

    // buildpackVersion
    /**
     * @example buildpackVersion
     *
     * @var string
     */
    public $buildpackVersion;

    // computerCount
    /**
     * @example
     *
     * @var int
     */
    public $computerCount;

    // databaseCount
    /**
     * @example
     *
     * @var int
     */
    public $databaseCount;

    // loadBalancerCount
    /**
     * @example
     *
     * @var int
     */
    public $loadBalancerCount;

    // cacheCount
    /**
     * @example
     *
     * @var int
     */
    public $cacheCount;

    // cellViewList
    /**
     * @example
     *
     * @var CellView[]
     */
    public $cellViewList;
    protected $_name = [
        'baseAppService'    => 'base_app_service',
        'ownerName'         => 'owner_name',
        'buildpackName'     => 'buildpack_name',
        'chineseName'       => 'chinese_name',
        'buildpackVersion'  => 'buildpack_version',
        'computerCount'     => 'computer_count',
        'databaseCount'     => 'database_count',
        'loadBalancerCount' => 'load_balancer_count',
        'cacheCount'        => 'cache_count',
        'cellViewList'      => 'cell_view_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->baseAppService) {
            $res['base_app_service'] = null !== $this->baseAppService ? $this->baseAppService->toMap() : null;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->computerCount) {
            $res['computer_count'] = $this->computerCount;
        }
        if (null !== $this->databaseCount) {
            $res['database_count'] = $this->databaseCount;
        }
        if (null !== $this->loadBalancerCount) {
            $res['load_balancer_count'] = $this->loadBalancerCount;
        }
        if (null !== $this->cacheCount) {
            $res['cache_count'] = $this->cacheCount;
        }
        if (null !== $this->cellViewList) {
            $res['cell_view_list'] = [];
            if (null !== $this->cellViewList && \is_array($this->cellViewList)) {
                $n = 0;
                foreach ($this->cellViewList as $item) {
                    $res['cell_view_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppServiceViewModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['base_app_service'])) {
            $model->baseAppService = AppService::fromMap($map['base_app_service']);
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['buildpack_name'])) {
            $model->buildpackName = $map['buildpack_name'];
        }
        if (isset($map['chinese_name'])) {
            $model->chineseName = $map['chinese_name'];
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['computer_count'])) {
            $model->computerCount = $map['computer_count'];
        }
        if (isset($map['database_count'])) {
            $model->databaseCount = $map['database_count'];
        }
        if (isset($map['load_balancer_count'])) {
            $model->loadBalancerCount = $map['load_balancer_count'];
        }
        if (isset($map['cache_count'])) {
            $model->cacheCount = $map['cache_count'];
        }
        if (isset($map['cell_view_list'])) {
            if (!empty($map['cell_view_list'])) {
                $model->cellViewList = [];
                $n                   = 0;
                foreach ($map['cell_view_list'] as $item) {
                    $model->cellViewList[$n++] = null !== $item ? CellView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
