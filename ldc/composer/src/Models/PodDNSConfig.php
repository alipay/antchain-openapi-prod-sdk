<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodDNSConfig extends Model
{
    // A list of DNS name server IP addresses
    /**
     * @example
     *
     * @var string[]
     */
    public $nameservers;

    // A list of DNS resolver options.
    /**
     * @example
     *
     * @var PodDNSConfigOption[]
     */
    public $options;

    // A list of DNS search domains for host-name lookup
    /**
     * @example
     *
     * @var string[]
     */
    public $searches;
    protected $_name = [
        'nameservers' => 'nameservers',
        'options'     => 'options',
        'searches'    => 'searches',
    ];

    public function validate()
    {
        Model::validateRequired('searches', $this->searches, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nameservers) {
            $res['nameservers'] = $this->nameservers;
        }
        if (null !== $this->options) {
            $res['options'] = [];
            if (null !== $this->options && \is_array($this->options)) {
                $n = 0;
                foreach ($this->options as $item) {
                    $res['options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->searches) {
            $res['searches'] = $this->searches;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodDNSConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['nameservers'])) {
            if (!empty($map['nameservers'])) {
                $model->nameservers = $map['nameservers'];
            }
        }
        if (isset($map['options'])) {
            if (!empty($map['options'])) {
                $model->options = [];
                $n              = 0;
                foreach ($map['options'] as $item) {
                    $model->options[$n++] = null !== $item ? PodDNSConfigOption::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['searches'])) {
            if (!empty($map['searches'])) {
                $model->searches = $map['searches'];
            }
        }

        return $model;
    }
}
