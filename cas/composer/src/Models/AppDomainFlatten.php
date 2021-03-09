<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppDomainFlatten extends Model
{
    // 一组具有依赖关系的 AppDomain
    /**
     * @example
     *
     * @var AppDomain[]
     */
    public $appDomains;
    protected $_name = [
        'appDomains' => 'app_domains',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appDomains) {
            $res['app_domains'] = [];
            if (null !== $this->appDomains && \is_array($this->appDomains)) {
                $n = 0;
                foreach ($this->appDomains as $item) {
                    $res['app_domains'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDomainFlatten
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_domains'])) {
            if (!empty($map['app_domains'])) {
                $model->appDomains = [];
                $n                 = 0;
                foreach ($map['app_domains'] as $item) {
                    $model->appDomains[$n++] = null !== $item ? AppDomain::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
