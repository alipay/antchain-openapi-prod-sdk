<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightAssetMeta extends Model
{
    // 资产元信息链接
    /**
     * @example https://openseacreatures.io/metadata.json
     *
     * @var string
     */
    public $uri;

    // 资产元信息
    /**
     * @example {"description":"Friendly OpenSea Creature that enjoys long swims in the ocean.","external_url":"https://openseacreatures.io/3","image":"https://storage.googleapis.com/puffs/3.png","name":"Dave","attributes":[{"trait_type":"Base","value":"Starfish"}]}
     *
     * @var string
     */
    public $metaData;

    // 资源类型：Image / Audio / Video / Unknown
    /**
     * @example Image
     *
     * @var string
     */
    public $resourceType;

    // 资源详细数据，如图片、视频的链接
    /**
     * @example https://storage.googleapis.com/puffs/3.png
     *
     * @var string
     */
    public $resourceData;
    protected $_name = [
        'uri'          => 'uri',
        'metaData'     => 'meta_data',
        'resourceType' => 'resource_type',
        'resourceData' => 'resource_data',
    ];

    public function validate()
    {
        Model::validateRequired('resourceType', $this->resourceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uri) {
            $res['uri'] = $this->uri;
        }
        if (null !== $this->metaData) {
            $res['meta_data'] = $this->metaData;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceData) {
            $res['resource_data'] = $this->resourceData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightAssetMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uri'])) {
            $model->uri = $map['uri'];
        }
        if (isset($map['meta_data'])) {
            $model->metaData = $map['meta_data'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_data'])) {
            $model->resourceData = $map['resource_data'];
        }

        return $model;
    }
}
