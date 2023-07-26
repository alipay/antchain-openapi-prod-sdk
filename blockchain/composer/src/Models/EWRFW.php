<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class EWRFW extends Model
{
    // FFF
    /**
     * @example
     *
     * @var DidDocServicesInfo[]
     */
    public $sdf;

    // www
    /**
     * @example www
     *
     * @var string
     */
    public $www;

    // ss
    /**
     * @example
     *
     * @var string[]
     */
    public $listString;

    // aaa
    /**
     * @example
     *
     * @var DidDocServicesInfo
     */
    public $aaa;
    protected $_name = [
        'sdf'        => 'sdf',
        'www'        => 'www',
        'listString' => 'list_string',
        'aaa'        => 'aaa',
    ];

    public function validate()
    {
        Model::validateRequired('sdf', $this->sdf, true);
        Model::validateRequired('www', $this->www, true);
        Model::validateRequired('listString', $this->listString, true);
        Model::validateRequired('aaa', $this->aaa, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sdf) {
            $res['sdf'] = [];
            if (null !== $this->sdf && \is_array($this->sdf)) {
                $n = 0;
                foreach ($this->sdf as $item) {
                    $res['sdf'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->www) {
            $res['www'] = $this->www;
        }
        if (null !== $this->listString) {
            $res['list_string'] = $this->listString;
        }
        if (null !== $this->aaa) {
            $res['aaa'] = null !== $this->aaa ? $this->aaa->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EWRFW
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sdf'])) {
            if (!empty($map['sdf'])) {
                $model->sdf = [];
                $n          = 0;
                foreach ($map['sdf'] as $item) {
                    $model->sdf[$n++] = null !== $item ? DidDocServicesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['www'])) {
            $model->www = $map['www'];
        }
        if (isset($map['list_string'])) {
            if (!empty($map['list_string'])) {
                $model->listString = $map['list_string'];
            }
        }
        if (isset($map['aaa'])) {
            $model->aaa = DidDocServicesInfo::fromMap($map['aaa']);
        }

        return $model;
    }
}
