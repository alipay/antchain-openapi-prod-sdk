<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XDatasourceCRULResponseCURequest extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $apiVersion;

    /**
     * @example
     *
     * @var XResource
     */
    public $metadata;

    /**
     * @example
     *
     * @var XSpec
     */
    public $spec;
    protected $_name = [
        'apiVersion' => 'api_version',
        'metadata'   => 'metadata',
        'spec'       => 'spec',
    ];

    public function validate()
    {
        Model::validateRequired('metadata', $this->metadata, true);
        Model::validateRequired('spec', $this->spec, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->spec) {
            $res['spec'] = null !== $this->spec ? $this->spec->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XDatasourceCRULResponseCURequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['metadata'])) {
            $model->metadata = XResource::fromMap($map['metadata']);
        }
        if (isset($map['spec'])) {
            $model->spec = XSpec::fromMap($map['spec']);
        }

        return $model;
    }
}
