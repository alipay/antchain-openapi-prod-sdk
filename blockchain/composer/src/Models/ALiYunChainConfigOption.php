<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainConfigOption extends Model
{
    // config_option
    /**
     * @example config_option
     *
     * @var string
     */
    public $configOption;

    // show_name
    /**
     * @example show_name
     *
     * @var string
     */
    public $showName;

    // enable
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;
    protected $_name = [
        'configOption' => 'config_option',
        'showName'     => 'show_name',
        'enable'       => 'enable',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->configOption) {
            $res['config_option'] = $this->configOption;
        }
        if (null !== $this->showName) {
            $res['show_name'] = $this->showName;
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainConfigOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['config_option'])) {
            $model->configOption = $map['config_option'];
        }
        if (isset($map['show_name'])) {
            $model->showName = $map['show_name'];
        }
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }

        return $model;
    }
}
