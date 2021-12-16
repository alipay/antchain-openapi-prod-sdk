<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CatalogVO extends Model
{
    // 类目Id
    /**
     * @example
     *
     * @var int
     */
    public $catalogId;

    // 类目名称
    /**
     * @example 企业及应用服务
     *
     * @var string
     */
    public $catalogName;

    // 子类目列表
    /**
     * @example
     *
     * @var Catalog[]
     */
    public $childCatalogs;
    protected $_name = [
        'catalogId'     => 'catalog_id',
        'catalogName'   => 'catalog_name',
        'childCatalogs' => 'child_catalogs',
    ];

    public function validate()
    {
        Model::validateRequired('catalogId', $this->catalogId, true);
        Model::validateRequired('catalogName', $this->catalogName, true);
        Model::validateRequired('childCatalogs', $this->childCatalogs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->catalogId) {
            $res['catalog_id'] = $this->catalogId;
        }
        if (null !== $this->catalogName) {
            $res['catalog_name'] = $this->catalogName;
        }
        if (null !== $this->childCatalogs) {
            $res['child_catalogs'] = [];
            if (null !== $this->childCatalogs && \is_array($this->childCatalogs)) {
                $n = 0;
                foreach ($this->childCatalogs as $item) {
                    $res['child_catalogs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CatalogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['catalog_id'])) {
            $model->catalogId = $map['catalog_id'];
        }
        if (isset($map['catalog_name'])) {
            $model->catalogName = $map['catalog_name'];
        }
        if (isset($map['child_catalogs'])) {
            if (!empty($map['child_catalogs'])) {
                $model->childCatalogs = [];
                $n                    = 0;
                foreach ($map['child_catalogs'] as $item) {
                    $model->childCatalogs[$n++] = null !== $item ? Catalog::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
