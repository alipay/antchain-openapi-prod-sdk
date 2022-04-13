<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SiteCell extends Model
{
    // 异构机房名
    /**
     * @example other-site
     *
     * @var string
     */
    public $siteName;

    // 部署单元名
    /**
     * @example cell-a
     *
     * @var string
     */
    public $name;

    // 地域
    /**
     * @example 杭州
     *
     * @var string
     */
    public $region;
    protected $_name = [
        'siteName' => 'site_name',
        'name'     => 'name',
        'region'   => 'region',
    ];

    public function validate()
    {
        Model::validateRequired('siteName', $this->siteName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SiteCell
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['site_name'])) {
            $model->siteName = $map['site_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }

        return $model;
    }
}
