<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class NavContent extends Model
{
    // hasw
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasw;

    // hast
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hast;

    // hasbiz
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasbiz;

    // nav_sites
    /**
     * @example nav_sites
     *
     * @var NavSite[]
     */
    public $navSites;
    protected $_name = [
        'hasw'     => 'hasw',
        'hast'     => 'hast',
        'hasbiz'   => 'hasbiz',
        'navSites' => 'nav_sites',
    ];

    public function validate()
    {
        Model::validateRequired('hasw', $this->hasw, true);
        Model::validateRequired('hast', $this->hast, true);
        Model::validateRequired('hasbiz', $this->hasbiz, true);
        Model::validateRequired('navSites', $this->navSites, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hasw) {
            $res['hasw'] = $this->hasw;
        }
        if (null !== $this->hast) {
            $res['hast'] = $this->hast;
        }
        if (null !== $this->hasbiz) {
            $res['hasbiz'] = $this->hasbiz;
        }
        if (null !== $this->navSites) {
            $res['nav_sites'] = [];
            if (null !== $this->navSites && \is_array($this->navSites)) {
                $n = 0;
                foreach ($this->navSites as $item) {
                    $res['nav_sites'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NavContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hasw'])) {
            $model->hasw = $map['hasw'];
        }
        if (isset($map['hast'])) {
            $model->hast = $map['hast'];
        }
        if (isset($map['hasbiz'])) {
            $model->hasbiz = $map['hasbiz'];
        }
        if (isset($map['nav_sites'])) {
            if (!empty($map['nav_sites'])) {
                $model->navSites = [];
                $n               = 0;
                foreach ($map['nav_sites'] as $item) {
                    $model->navSites[$n++] = null !== $item ? NavSite::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
