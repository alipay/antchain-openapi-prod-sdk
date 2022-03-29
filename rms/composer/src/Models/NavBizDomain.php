<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NavBizDomain extends Model
{
    // biz_domain
    /**
     * @example biz_domain
     *
     * @var BizDomain
     */
    public $bizDomain;
    protected $_name = [
        'bizDomain' => 'biz_domain',
    ];

    public function validate()
    {
        Model::validateRequired('bizDomain', $this->bizDomain, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizDomain) {
            $res['biz_domain'] = null !== $this->bizDomain ? $this->bizDomain->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NavBizDomain
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_domain'])) {
            $model->bizDomain = BizDomain::fromMap($map['biz_domain']);
        }

        return $model;
    }
}
