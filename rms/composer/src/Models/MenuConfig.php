<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class MenuConfig extends Model
{
    // 是否需要在顶部菜单展示各个入口
    /**
     * @example true, false
     *
     * @var bool
     */
    public $showTopNavPages;

    // 需要隐藏的菜单
    /**
     * @example
     *
     * @var Menu[]
     */
    public $hideMenus;
    protected $_name = [
        'showTopNavPages' => 'show_top_nav_pages',
        'hideMenus'       => 'hide_menus',
    ];

    public function validate()
    {
        Model::validateRequired('showTopNavPages', $this->showTopNavPages, true);
        Model::validateRequired('hideMenus', $this->hideMenus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->showTopNavPages) {
            $res['show_top_nav_pages'] = $this->showTopNavPages;
        }
        if (null !== $this->hideMenus) {
            $res['hide_menus'] = [];
            if (null !== $this->hideMenus && \is_array($this->hideMenus)) {
                $n = 0;
                foreach ($this->hideMenus as $item) {
                    $res['hide_menus'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MenuConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['show_top_nav_pages'])) {
            $model->showTopNavPages = $map['show_top_nav_pages'];
        }
        if (isset($map['hide_menus'])) {
            if (!empty($map['hide_menus'])) {
                $model->hideMenus = [];
                $n                = 0;
                foreach ($map['hide_menus'] as $item) {
                    $model->hideMenus[$n++] = null !== $item ? Menu::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
