<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppDomainView extends Model
{
    // ownerName
    /**
     * @example ownerName
     *
     * @var string
     */
    public $ownerName;

    // fatherDomainName
    /**
     * @example fatherDomainName
     *
     * @var string
     */
    public $fatherDomainName;

    // 应用列表
    /**
     * @example
     *
     * @var AppView[]
     */
    public $apps;

    // AppDomainView 的父类 AppDomain
    /**
     * @example
     *
     * @var AppDomain[]
     */
    public $baseAppDomain;
    protected $_name = [
        'ownerName'        => 'owner_name',
        'fatherDomainName' => 'father_domain_name',
        'apps'             => 'apps',
        'baseAppDomain'    => 'base_app_domain',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->fatherDomainName) {
            $res['father_domain_name'] = $this->fatherDomainName;
        }
        if (null !== $this->apps) {
            $res['apps'] = [];
            if (null !== $this->apps && \is_array($this->apps)) {
                $n = 0;
                foreach ($this->apps as $item) {
                    $res['apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->baseAppDomain) {
            $res['base_app_domain'] = [];
            if (null !== $this->baseAppDomain && \is_array($this->baseAppDomain)) {
                $n = 0;
                foreach ($this->baseAppDomain as $item) {
                    $res['base_app_domain'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDomainView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['father_domain_name'])) {
            $model->fatherDomainName = $map['father_domain_name'];
        }
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = [];
                $n           = 0;
                foreach ($map['apps'] as $item) {
                    $model->apps[$n++] = null !== $item ? AppView::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['base_app_domain'])) {
            if (!empty($map['base_app_domain'])) {
                $model->baseAppDomain = [];
                $n                    = 0;
                foreach ($map['base_app_domain'] as $item) {
                    $model->baseAppDomain[$n++] = null !== $item ? AppDomain::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
