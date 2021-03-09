<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseEngine extends Model
{
    // iaas_type
    /**
     * @example iaas_type
     *
     * @var string
     */
    public $iaasType;

    // engine
    /**
     * @example engine
     *
     * @var string
     */
    public $engine;

    // engine_versions
    /**
     * @example
     *
     * @var string[]
     */
    public $engineVersions;
    protected $_name = [
        'iaasType'       => 'iaas_type',
        'engine'         => 'engine',
        'engineVersions' => 'engine_versions',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->engine) {
            $res['engine'] = $this->engine;
        }
        if (null !== $this->engineVersions) {
            $res['engine_versions'] = $this->engineVersions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseEngine
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['engine'])) {
            $model->engine = $map['engine'];
        }
        if (isset($map['engine_versions'])) {
            if (!empty($map['engine_versions'])) {
                $model->engineVersions = $map['engine_versions'];
            }
        }

        return $model;
    }
}
