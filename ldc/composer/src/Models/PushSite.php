<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PushSite extends Model
{
    // 是否当前站点
    /**
     * @example true, false
     *
     * @var bool
     */
    public $current;

    // 站点描述
    /**
     * @example blabla
     *
     * @var string
     */
    public $description;

    // 站点唯一标识
    /**
     * @example 001
     *
     * @var int
     */
    public $id;

    // 接口类型，可选（RPC，REST）
    /**
     * @example RPC
     *
     * @var string
     */
    public $interfaceType;

    // 站点 DRM endpoints
    /**
     * @example
     *
     * @var string[]
     */
    public $interfaceUrls;

    // 站点名称
    /**
     * @example 主站
     *
     * @var string
     */
    public $name;

    // 站点部署单元
    /**
     * @example
     *
     * @var SiteCell[]
     */
    public $siteCells;

    // 站点类型，可选（MAIN，ISOMERISM）
    /**
     * @example MAIN
     *
     * @var string
     */
    public $siteType;
    protected $_name = [
        'current'       => 'current',
        'description'   => 'description',
        'id'            => 'id',
        'interfaceType' => 'interface_type',
        'interfaceUrls' => 'interface_urls',
        'name'          => 'name',
        'siteCells'     => 'site_cells',
        'siteType'      => 'site_type',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('interfaceType', $this->interfaceType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('siteType', $this->siteType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->interfaceType) {
            $res['interface_type'] = $this->interfaceType;
        }
        if (null !== $this->interfaceUrls) {
            $res['interface_urls'] = $this->interfaceUrls;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->siteCells) {
            $res['site_cells'] = [];
            if (null !== $this->siteCells && \is_array($this->siteCells)) {
                $n = 0;
                foreach ($this->siteCells as $item) {
                    $res['site_cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushSite
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['interface_type'])) {
            $model->interfaceType = $map['interface_type'];
        }
        if (isset($map['interface_urls'])) {
            if (!empty($map['interface_urls'])) {
                $model->interfaceUrls = $map['interface_urls'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['site_cells'])) {
            if (!empty($map['site_cells'])) {
                $model->siteCells = [];
                $n                = 0;
                foreach ($map['site_cells'] as $item) {
                    $model->siteCells[$n++] = null !== $item ? SiteCell::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['site_type'])) {
            $model->siteType = $map['site_type'];
        }

        return $model;
    }
}
