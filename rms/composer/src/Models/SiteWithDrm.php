<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class SiteWithDrm extends Model
{
    // 站点名称
    /**
     * @example test
     *
     * @var string
     */
    public $siteName;

    // 端点
    /**
     * @example test
     *
     * @var string
     */
    public $endpoint;

    // ldc
    /**
     * @example
     *
     * @var string[]
     */
    public $ldcs;
    protected $_name = [
        'siteName' => 'site_name',
        'endpoint' => 'endpoint',
        'ldcs'     => 'ldcs',
    ];

    public function validate()
    {
        Model::validateRequired('siteName', $this->siteName, true);
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('ldcs', $this->ldcs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->ldcs) {
            $res['ldcs'] = $this->ldcs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SiteWithDrm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['site_name'])) {
            $model->siteName = $map['site_name'];
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['ldcs'])) {
            if (!empty($map['ldcs'])) {
                $model->ldcs = $map['ldcs'];
            }
        }

        return $model;
    }
}
